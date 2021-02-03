# 객체지향개발론

<h2> MVC , Usecase, SSD, Contract </h2>

- MVC : Model View Controller
- Usecase : user 관점에서의 functional requirement , Goal을 달성하기 위해 사용자가 시스템을 사용하고 있는 이야기
- System Sequence Diagram : Actor 가 system behavior를 Sud에게 요청하는 것
- Contract : 자세한 system behavior를 기술

# O-Market POS System
<h3>위의 개념을 반영하여 POS 시스템 구현</h3>

- Primary Actor : Cashier로 지정 

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


## SSD
![IMG_A1B5CA88E74F-1](https://user-images.githubusercontent.com/42709887/103047789-eb1c9d80-45cf-11eb-8447-0c4358ac1445.jpeg)


## 소스코드 구성
<img width="450" alt="스크린샷 2021-02-04 오전 12 23 43" src="https://user-images.githubusercontent.com/42709887/106768411-3e7a1500-667f-11eb-9f79-f142e6b13657.png">

## Model View Controller 분리

- 사용자의 요구가 cmd-> Graphic으로 바뀔 때 main 이외 별다른 코드 수정없이 주석 처리만 해주면 됨 
<img width="649" alt="스크린샷 2021-02-04 오전 12 24 17" src="https://user-images.githubusercontent.com/42709887/106768517-5356a880-667f-11eb-9cd5-83e7e87c90a1.png">


(참고 문헌 : Applying UML and Patterns 3rd Edition)
