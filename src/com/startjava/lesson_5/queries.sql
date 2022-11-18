--выведите всю таблицу
SELECT * 
  FROM jaegers;

--отобразите только не уничтоженных роботов
SELECT * 
  FROM jaegers 
 WHERE status = 'Active';

--отобразите роботов нескольких серий: Mark-1 и Mark-4
SELECT * 
  FROM jaegers 
 WHERE mark IN (1, 4);

--отобразите всех роботов, кроме Mark-1 и Mark-4
SELECT * 
  FROM jaegers  
 WHERE mark NOT IN (1, 4);

--отсортируйте таблицу по убыванию по столбцу mark
SELECT * 
  FROM Jaegers 
 ORDER BY mark DESC;

--отобразите информацию о самом старом роботе
SELECT * 
  FROM Jaegers 
  WHERE launch = 
       (SELECT MIN(launch) 
          FROM Jaegers);

--отобразите роботов, которые уничтожили больше всех kaiju
SELECT * 
  FROM Jaegers 
 WHERE kaijuKill = 
         (SELECT MAX(kaijuKill) 
            FROM Jaegers);

--отобразите средний вес роботов
SELECT AVG(weight) 
    AS average_weight
  FROM Jaegers; 

--увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE Jaegers 
   SET kaijuKill = kaijuKill + 1 
 WHERE status = 'Active';

--удалите уничтоженных роботов
DELETE FROM Jaegers 
 WHERE status = 'Destroyed';
