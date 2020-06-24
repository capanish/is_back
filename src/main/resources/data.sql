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
      ('Banana',3,'Y','assets/images/bananas_new.jpg',0),
      ('Apple',3,'Y','assets/images/apples.jpg',0),
      ('Pear',3,'Y','assets/images/pears_new.jpg',0),
      ('Peas',3,'Y','assets/images/peas.jpg',0),
      ('Cabbage',3,'Y','assets/images/cabbage.jpg',0),    
      ('Tomato',3,'Y','assets/images/tomatoes.jpeg',0),
      ('Capsicum',3,'Y','assets/images/capsicum.jpeg',0),
      ('Potato',3,'Y','assets/images/potatoes.jpeg',0),
      ('Onions',3,'Y','assets/images/onions.jpeg',0),
      ('Cherry',3,'Y','assets/images/cherries.jpeg',0),
      ('Lemon',3,'Y','assets/images/lemon.jpeg',0),
      ('Oranges',3,'Y','assets/images/oranges.jpeg',0),
      
      ('Bacon',4,'Y','assets/images/bacon.jpg',0),
      ('Ham',4,'Y','assets/images/cooked_ham.jpg',0),
      ('Jamon',4,'Y','assets/images/jamon.jpg',0),
      ('Sausage',4,'Y','assets/images/sausage.jpg',0),    
      ('Salami',4,'Y','assets/images/salami.jpg',0),
      ('Morcilla',4,'Y','assets/images/morcilla.jpg',0),
      ('Fuet',4,'Y','assets/images/fuet.jpg',0),
      ('Butifarra',4,'Y','assets/images/butifarra.jpg',0);

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