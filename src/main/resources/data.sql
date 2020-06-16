INSERT INTO MENU(MENU_NAME,ACTIVE,IMAGE,NOTIFICATION)
  VALUES
      ('My List','Y','assets/images/mylist.jpeg',0),
      ('Recipes','Y','assets/images/recipes_new.jpg',5),
      ('Veggies','Y','assets/images/veggies_new.jpg',0),
      ('Meat','Y','assets/images/meat_new.jpg',0),
      ('Fish','Y','assets/images/fish_new.jpg',0),
      ('Deals','Y','assets/images/deals_new.jpg',2);
      
 INSERT INTO SUB_MENU(SUB_MENU_NAME,FK_MENU_ID,ACTIVE,IMAGE,NOTIFICATION)
  VALUES
      ('Banana',3,'Y','assets/images/bananas.jpg',0),
      ('Apple',3,'Y','assets/images/apples.jpg',0),
      ('Pear',3,'Y','assets/images/pears.jpg',0),
      ('Peas',3,'Y','assets/images/kiwis.jpg',0),
      ('Cabbage',3,'Y','assets/images/blackberries.jpg',0),    
      ('Tomato',3,'Y','assets/images/oranges.jpg',0),
      ('Capsicum',3,'Y','assets/images/pineapples.jpg',0),
      ('Potato',3,'Y','assets/images/peaches.jpg',0),
      ('Onions',3,'Y','assets/images/strawberries.jpg',0),
      ('Cherry',3,'Y','assets/images/strawberries.jpg',0),
      ('Lemon',3,'Y','assets/images/strawberries.jpg',0),
      ('Oranges',3,'Y','assets/images/strawberries.jpg',0);
  /*    
 INSERT INTO INFORMATION(FK_SUB_MENU_ID,PROCURE_DATE,SUGAR,PROTEIN,WATER,SODIUM,
 CALCIUM,IRON,ITEM_DESCRIPTION,LOCATION,ACTIVE,IMAGE)
  VALUES
      (1,curdate(),10,10,10,10,10,10,'Bananas are good','Bengaluru','y','assets/images/bananas.jpg'),
	  (2,curdate(),10,10,10,10,10,10,'Tomatoes are good','Bengaluru','y','assets/images/bananas.jpg'),
	  (3,NOW(),10,10,10,10,10,10,'Bananas are good','Bengaluru','y','assets/images/bananas.jpg'),
	  (4,NOW(),10,10,10,10,10,10,'Tomatoes are good','Bengaluru','y','assets/images/bananas.jpg'),
	  (5,NOW(),10,10,10,10,10,10,'Bananas are good','Bengaluru','y','assets/images/bananas.jpg'),
	  (6,NOW(),10,10,10,10,10,10,'Tomatoes are good','Bengaluru','y','assets/images/bananas.jpg'),
	  (7,NOW(),10,10,10,10,10,10,'Bananas are good','Bengaluru','y','assets/images/bananas.jpg'),
	  (8,NOW(),10,10,10,10,10,10,'Tomatoes are good','Bengaluru','y','assets/images/bananas.jpg'),
	  (9,NOW(),10,10,10,10,10,10,'Bananas are good','Bengaluru','y','assets/images/bananas.jpg');
*/
       INSERT INTO INFORMATION(FK_SUB_MENU_ID,IMAGE)
  VALUES
      (1,'assets/images/nutriInfo_banana.jpg'),
	  (2,'assets/images/nutriInfo_Tomato.jpg'),
	  (3,'assets/images/nutriInfo_banana.jpg'),
	  (4,'assets/images/nutriInfo_banana.jpg'),
	  (5,'assets/images/nutriInfo_banana.jpg'),
	  (6,'assets/images/nutriInfo_banana.jpg'),
	  (7,'assets/images/nutriInfo_banana.jpg'),
	  (8,'assets/images/nutriInfo_banana.jpg'),
	  (9,'assets/images/nutriInfo_banana.jpg');
commit;