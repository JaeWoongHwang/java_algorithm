require 'httparty'
require 'nokogiri'

url = "http://comic.naver.com/webtoon/weekday.nhn"

response = HTTParty.get(url)

html = Nokogiri::HTML(response.body)
#webtoon = html.css('#content > div.list_area.daily_img > ul > li:nth-child(4) > dl > dt > a')
webtoon = html.css("dt")
puts webtoon