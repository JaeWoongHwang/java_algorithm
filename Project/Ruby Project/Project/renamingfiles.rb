#파일이 있는 폴더로 들어가기
Dir.chdir('src')

puts Dir.pwd
#Dir.pwd로 경로를 나타내주는 걸 이용

# 이 안에 있는 데이터들을 배열로 만들어 리스트(배열)로 보여준다
list =  Dir.entries(Dir.pwd)
#reject를 통해 해당 배열에서 .으로 시작하는 파일들을 제외한다
list = Dir.entries("C:/Users/student/project/src").reject {|name| name[0] == "."}

list.each do |f|
	File.rename(f,"2017" + f)
end

# 배열의 길이 혹은 스트링의 길이를 할고 싶을때 .length
# puts list.length
# sam = "Hello Everyone"
# puts sam.length

# list.each do |file|
#   puts file
# end

# File rename
# File.rename("test.txt", "hope.txt")
# File.rename("원래 파일명", "바꿀 파일명")

# 파일을 각각 돌면서 파일 이름을 바꾸고 싶을 때
20.times do |n|
	File.rename("#{n+1}test.txt", "SAP#{n+1}list.txt")
end


