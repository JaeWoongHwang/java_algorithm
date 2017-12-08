require 'launchy'

url = "http://www.google.com"
search = "https://search.naver.com/search.naver?query="
keywords = ["코스닥", "코스피"]

keywords.each do |key|
	Launchy.open(search + key)	
end
