# 파일 만들기 양식 / 쉽게 파일을 다량으로 만들 수 있음
#File.open("test.txt", "w") do |f|     
  #f.write('Hack your life')   
#end

# |특정변수|를 넣으면 활용이 가능함 n과 timer의 변수는 0부터 증감이 되는 기능을 내포
#5.times do |timer|
#puts timer
#end

#.text 20개를 만든다
#양식 몇번째 파일 + list
#20.times do |timer|
	#숫자와 string 을 합치면 오류가 남
	#string으로 타입변환
		#puts timer.to_s + "list"
#end

# 루비는 파일에 대한 정보를 dir에 담고 있다
# puts Dir.pwd
# 폴더 변경
puts Dir.chdir('src')

puts Dir.pwd

20.times do |n|
	File.open("#{n+1}test.txt", "w") do |f|     
  	f.write("#{n+1}번째 파일입니다.")   
	end
end

# concatenation : 합체 ""+"" 느낌
# interpolation : 인터폴(성형수술 느낌) "()"

# age = 28
# 	puts "My age is " + age.to_s
# 	puts "I'm #{age} years old" 