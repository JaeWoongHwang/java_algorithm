require 'sinatra'
require 'httparty'
require 'nokogiri'
require 'uri'
require 'csv'
require 'date'

get '/' do 
  erb :index
end

get '/search' do
  @id = params["id"]

  @encoded = URI.encode(@id)
  response = HTTParty.get("http://www.op.gg/summoner/userName=" + @encoded)
 
	html = Nokogiri::HTML(response.body)
  @tier = html.css('#SummonerLayoutContent > div.tabItem.Content.SummonerLayoutContent.summonerLayout-summary > div.SideContent > div.TierBox.Box > div.SummonerRatingMedium > div.TierRankInfo > div.TierRank > span')
  @win = html.css('#SummonerLayoutContent > div.tabItem.Content.SummonerLayoutContent.summonerLayout-summary > div.SideContent > div.TierBox.Box > div.SummonerRatingMedium > div.TierRankInfo > div.TierInfo > span.WinLose > span.wins')
  @lose = html.css('#SummonerLayoutContent > div.tabItem.Content.SummonerLayoutContent.summonerLayout-summary > div.SideContent > div.TierBox.Box > div.SummonerRatingMedium > div.TierRankInfo > div.TierInfo > span.WinLose > span.losses')

	File.open("log.txt", "a+") do |f|     
  	# 아이디, 승, 패, 티어
  	f.write("#{@id}, #{@tier.text}, #{@win.text}, #{@lose.text}" + "\n")   
	end

	CSV.open("log.csv", "a+") do |csv|
 		csv << [@id, @tier.text, @win.text, @lose.text, Time.now.to_s]
	end

  erb :search
end