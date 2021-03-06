# Разработать модель для банковской системы.
В системе можно производитель следующие действия:
 
1. Регистрировать клиента.
1. Удалять клиента из системы.
1. Добавлять клиенту банковский счет. У пользователя системы могут быть несколько счетов.
1. Переводить деньги с одного банковского счета на другой счет.

## Описание модели банковского счета.
`Account{}` Эта модель содержит поля:
 * баланс 
 * реквизиты.
  
## Модель клиента банка.
`User{}` Это модель содержит поля:
 * номер паспорта 
 * ФИО.
 
## Создадим главный сервис.
`BankService.`

**Это поле содержит всех клиентов системы с привязанными к ним счетами.** 

 `private Map<User, List<Account>> users = new HashMap<>();`
 
**Это метод должен добавить клиента в систему.** 
 
 `public void addUser(User user) {`
 
 Чтобы добавить клиента в систему нужно использовать метод `Map.put.`
 
 Этот метод принимает два параметра: клиента и список счетов. 
 По умолчанию нужно добавить пустой список - `new ArrayList<Account>().`
 В методе должна быть проверка, что такого клиента еще нет в системе. 
 Если он есть, то нового добавлять не надо.
  
**Должен добавить новый счет к клиенту.** 
 
 `public void addAccount(String passport, Account account) {`
 
 Первоначально клиента нужно найти по паспорту.
 Для этого нужно использовать `метод findByPassport.` 
 После этого мы получим список всех счетов клиента и добавим новый счет к ним. 
 В этом методе должна быть проверка, что такого счета у клиента еще нет.
  
 
**Это метод ищет клиента по номеру паспорта.** 
 
 `public User findByPassport(String passport) {`
 
 Здесь нужно использовать перебор всех элементов через цикл `for-earch` и метод `Map.keySet.`
  
 **Этот метод ищет счет клиента по реквизитам.** 
 
 `public Account findByRequisite(String passport, String requisite) {`
 
 Сначала нужно найти клиента. Потом получить список счетов этого клиента и в нем найти нужный счет.

 
**Метод для перечисления денег с одного счета на другой счет.**
 
 `public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String dеstRequisite, double amount) {`
 
 Если счет не найден или не хватает денег на счете `srcAccount` (с которого переводят), 
 то метод должен вернуть `false.`
   
 Посмотрите на методы `Map.putIfAbsent` и `List.contains,` как их можно применить в этом задании.
 Метод `putIfAbsent` позволяет проверить, если ли такой ключ в карте или нет и если его нет, 
 то произвести вставку данных. Этот метод позволяет уменьшить количество кода.
  
 Метод `List.indexOf` позволяет найти индекс элемента по значению. 
 Проверка элементов в этом методе происходит по методу `equals.` 
 Обратите внимание, что в моделях `User` и `Account` 
 используется только одно поле `passport` и `requisite` 
 для сравнения объектов. Это позволяет использовать эти методы, 
 без информации о всех полях.
  
---
 - [x] ~~Реализовать шаблоны моделей~~
 - [x] ~~Реализовать модель главного сервиса **BankService**~~
 
 