require 'httparty'
require 'nokogiri'

# httparty.get 원하는 정보가 있는 조소로 요청을 보냄
# nokogiri :: HTML () 해당 문서를 검색하기 쉽게 바꿈
# css.('selector 경로')원하는 정보만 뽑아오기

url = 'http://finance.naver.com/world/sise.nhn?symbol=LNS@FTSE100'
response = HTTParty.get(url)

html = Nokogiri::HTML(response.body)
nasdaq = html.css('#wrap > div.section_world.section_world_end > div.group_h > div > h2')

puts nasdaq.text
