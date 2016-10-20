

Небольшое описание.

Для доступа к БД необходимо смотреть параметры в src/main/resources/META-INF/persistence.xml

Это пример настроек, у указанием пути к БД, логином и паролем
			<property name="hibernate.connection.url" value="jdbc:mysql://localhost:3306/site_list" />
			<property name="hibernate.connection.username" value="root" />
			<property name="hibernate.connection.password" value="root" />

Этот параметр, если не закомментирован, создает таблицы в БД автоматически (и связи тоже, если они определены)
            <property name="hibernate.hbm2ddl.auto" value="update" />


В ServiceController есть 2 метода, чтоб они вызвались, нужно в браузере перейти по ссылке
http://localhost:8080/service/1 и http://localhost:8080/service/2

Задача
создать еще одну класс-сущность (поля id, name, address, age)
при переходе по первой ссылке создается новая сущность (с любыми данными) и сохраняется в бд
при переходе по второй ссылке в консоль выводится списко этих сущностей сущностей


Единственное отличие от JPA, то, что EntityManager это обертка над SessionFactory, не принципиально что использовать
Можно смотреть все примеры с пометкой Annotation http://www.mkyong.com/tutorials/hibernate-tutorials/
еще пример http://devcolibri.com/1658

Для работы со спрингом нужно почитать книгу Spring в действии, до раздела spring security