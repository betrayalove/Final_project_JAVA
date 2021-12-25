# Итоговый проект JAVA (1 Вариант)

____

В ```Main'e``` мы вызывае метод из класса ```SpbBaseParser.java```, внутри этого класса мы создаем новые объекты для каждый строчки ```CSV``` таблицы. Эти объекты перемещаем в список. Затем мы создаем объект для работы со ```SQL```. Затем мы последовательно выполняем задания SQL запросами.

____

__1) В первом__ задании мы работаем со столбцом _number_of_floor_ для того, чтобы корректно парсить количество этажей мы убираем символы, неотносящиеся к цифрам ('Мяюэьыъщшчцхфутсрпонмлкйизжёедгвба-'), так как запись в данном столбце идет таким образом: 1-этажный, 2-этажный. Считаем количество домов с определенным количеством этажей и создаем график на основе этих данных с помощью библиотеки ```JFreeChart```.

__2) Во втором__ задании мы отбираем строчки с _prefix_code = 9881_ и _appellation = Зарегистрированный участок_, мы не используем столбец _address_, так как все здания с _prefix_code = 9881_ уже имеют в адресе _улицу = шлиссельбургское шоссе_. Адреса для вывода мы собираем в ```StringBuilder```.

__3) В третьем__ задании мы используем столбцы _appellation = Университет_, _number_of_floor > 5_, _prefix_code_, и не пустым _year_construction_. Со столбцом _number_of_floor_ мы работаем также, как и в первой задаче. Во время добавления всех адресов в ```StringBuilder```, для их сборки, мы считаем средний _prefix_code_ и также в конце добавляем его в ```StringBuilder```.

____

## 1 Вариант

### Консольный вывод первой задачи:

![alt](https://github.com/betrayalove/Final_project_JAVA/blob/master/Первая%20задача.png)

### График первой задачи:

![alt1](https://github.com/betrayalove/Final_project_JAVA/blob/master/task1.png)

### Консольный вывод второй задачи:

![alt2](https://github.com/betrayalove/Final_project_JAVA/blob/master/Вторая%20задача.png)

### Консольный вывод третьей задачи:

![alt3](https://github.com/betrayalove/Final_project_JAVA/blob/master/Третья%20задача.png)
