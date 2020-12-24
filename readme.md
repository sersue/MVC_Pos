# 객체지향개발론
MVC , Usecase, SSD, Contract
- MVC : Model View Controller
- Usecase : user 관점에서의 functional requirement , Goal을 달성하기 위해 사용자가 시스템을 사용하고 있는 이야기
- System Sequence Diagram : Actor 가 system behavior를 Sud에게 요청하는 것
- Contract : 자세한 system behavior를 기술

# O-Market Pos System
## Primary Actor : Cashier    

## Main Success scenario : 
<img width="708" alt="스크린샷 2020-12-24 오전 9 52 33" src="https://user-images.githubusercontent.com/42709887/103047116-c9221b80-45cd-11eb-8c9f-7362b4362514.png">

## Extensions
- [ ] 3a. Invalid identifier :
        1. System signals error and rejects entry
- [ ] 3b. There are multiple of same item category and tracking unique item idntity not important (ex. 5 packages of veggie-burgers):
        1. Cashier can enter item category identifier and the quantity
- [ ] 3-6a. Customer asks Cashier to remove an item from the purchase:
        1. Cashier enters the item identifier for removal from the sale
        2. System displays updated running total
- [ ] 7b. Paying by credit:
        1. Customer enters their credit card information
        2. System requests payment validation from external Payment authorization serive systems
            2a. System detects failure to collaborate with external system
                1. System signals error to Cashier
                2. Cashier asks Customer for alternate payment

## SSD
![IMG_A1B5CA88E74F-1](https://user-images.githubusercontent.com/42709887/103047789-eb1c9d80-45cf-11eb-8447-0c4358ac1445.jpeg)


## Contract


(참고 문헌 : Applying UML and Patterns 3rd Edition)
