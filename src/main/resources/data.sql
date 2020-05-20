INSERT INTO MENU(MENU_NAME,ACTIVE,IMAGE,NOTIFICATION)
  VALUES
      ('Veggies','Y','assets/images/veggies.jpg',0),
      ('Meat','Y','assets/images/meat.jpg',0),
      ('Fish','Y','assets/images/fish.jpg',0),
      ('Deals','Y','assets/images/deals.jpg',2),
      ('Recipe','Y','assets/images/recipe.jpg',5);
      
 INSERT INTO SUB_MENU(SUB_MENU_NAME,FK_MENU_ID,ACTIVE,IMAGE,NOTIFICATION)
  VALUES
      ('Banana',1,'Y','assets/images/veggies.jpg',0),
      ('Apple',1,'Y','assets/images/meat.jpg',0),
      ('Pear',1,'Y','assets/images/fish.jpg',0),
      ('Kiwi',1,'Y','assets/images/deals.jpg',0),
      ('Blackberry',1,'Y','assets/images/recipe.jpg',0),    
      ('Orange',1,'Y','assets/images/recipe.jpg',0),
      ('Pineapple',1,'Y','assets/images/recipe.jpg',0),
      ('Peach',1,'Y','assets/images/recipe.jpg',0),
      ('Strawberry',1,'Y','assets/images/recipe.jpg',0);
commit;