Feature: Creating new user portal

Scenario: Create useer

 	Given Launch Chrome Browser
 	When Enter url "http://www.newtours.demoaut.com/"
 	Then Click on Register user link
 	And Enter FirstName as "Bacd0"
 	And Enter LastName as "Sirvi"
 	And Enter Phone Number as "1234567890"
 	And Enter EmailID as "abcd@gmail.com"
 	And Enter Adress as "Hyderabad"
 	And Enter City as "Kondapur"
 	And Enter State/Province as "Tel State"
 	And Enter Postal Code as "500084"
 	And Enter Country as "TOGO"
 	And Enter User Name as "MyUser"
 	And Enter Password  "abc@1234" and confirm password "abc@1234"
 	Then Close Browser
 	
#Scenario Outline: Create multiple user data
#  	Given Launch Chrome Browser
# 	When Enter url "http://www.newtours.demoaut.com/"
# 	Then Click on Register user link
# 	And Enter FirstName as "<Firstname>"
# 	And Enter LastName as "<LastName>"
# 	And Enter Phone Number as "<PhoneNumber>"
# 	And Enter EmailID as "<EmailID>"
# 	And Enter Adress as "<Address>"
# 	And Enter City as "<City>"
# 	And Enter State/Province as "<State>"
# 	And Enter Postal Code as "<PinCode>"
# 	And Enter Country as "<Country>"
# 	And Enter User Name as "<UserName>"
# 	And Enter Password  "<Password>" and confirm password "<ConfirmPassword>"
# 	Then Close Browser
# 	
# 	Examples:
# 		|Firstname|LastName|PhoneNumber|EmailID|Address|City|State|PinCode|Country|UserName|Password|ConfirmPassword|
# 		|fone     | lastone|1234567890 |abc@gmail.com|adone|cone|S1|52112|INDIA| userone|password1|password1|
# 		|ftwo     | lasttwo|9876543210 |def@gmail.com|adtwo|ctwo|S2|12345|TOGO | usertwo|password2|password3|
 	
 	
 	