require 'launchy'

url = "http://www.google.com"
search = "https://search.naver.com/search.naver?query="
keywords = ["SAP", "Git hub", "bitcoin", "blockchain", "linkedin"]

keywords.each do |key|
	Launchy.open(search + key)	
end

