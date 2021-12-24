# Итоговый проект JAVA

____

В ```Main'e``` мы вызывае метод из класса ```SpbBaseParser.java```, внутри этого класса мы создаем новые объекты для каждый строчки ```CSV``` таблицы. Все эти объекты перемещаем в список. Затем мы моздаем объект для работы со ```SQL```. Затем мы последовательно выполняем задания SQL запросами.

____

__В первом__ задании мы работаем со столбцом _number_of_floor_ (считаем количество домов с определенным количеством этажей) и создаем график с помощью библиотеки ```JFreeChart```.

__Во втором__ задании мы отбираем строчки с _prefix_code = 9881_ и _appellation = Зарегистрированный участок_, мы не используем столбец _address_, так как все здания с _prefix_code = 9881_ уже имеют в адресе _улицу = шлиссельбургское шоссе_. Адреса для вывода мы собираем в ```StringBuilder```.

__В третьем__ задании мы используем столбцы _appellation = Университет_, _number_of_floor > 5_, _prefix_code_, и не пустым _year_construction_. Во время добавления всех адресов в ```StringBuilder```, для их сборки, мы считаем средний _prefix_code_ и также добавляем его в ```StringBuilder```.

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
