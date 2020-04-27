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
 	
 	
 	