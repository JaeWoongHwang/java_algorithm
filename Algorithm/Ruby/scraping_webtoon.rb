require 'httparty'
require 'nokogiri'

url = "http://comic.naver.com/webtoon/weekday.nhn"

response = HTTParty.get(url)

html = Nokogiri::HTML(response.body)
webtoon = html.css('#content > table > tbody > tr:nth-child(2) > td.title > a')

puts webtoon.text