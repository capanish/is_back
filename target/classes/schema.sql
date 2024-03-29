CREATE TABLE IF NOT EXISTS MENU (
  MENU_ID int(11) NOT NULL AUTO_INCREMENT,
  MENU_NAME varchar(255) NOT NULL,
  ACTIVE ENUM('y','n') NOT NULL,
  IMAGE varchar(1000),
  NOTIFICATION smallint,
  PRIMARY KEY (MENU_ID)
  );
CREATE TABLE IF NOT EXISTS SUB_MENU(
  SUB_MENU_ID int(11) NOT NULL AUTO_INCREMENT,
  SUB_MENU_NAME varchar(255) NOT NULL,
  FK_MENU_ID int(11) NOT NULL,
  ACTIVE ENUM('y','n') NOT NULL,
  IMAGE varchar(1000),
  NOTIFICATION smallint ,
  PRIMARY KEY (SUB_MENU_ID),
  UNIQUE KEY SUB_MENU_UNIQUE (SUB_MENU_ID, FK_MENU_ID),
  FOREIGN KEY (FK_MENU_ID) REFERENCES MENU (MENU_ID)
  );

  
   CREATE TABLE IF NOT EXISTS INFORMATION (
  INFO_ID int(11) NOT NULL AUTO_INCREMENT,
  NAME varchar(255),
  FK_SUB_MENU_ID int(11) NOT NULL,
  IMAGE varchar(1000),
  PRIMARY KEY (INFO_ID),
  FOREIGN KEY (FK_SUB_MENU_ID) REFERENCES SUB_MENU (SUB_MENU_ID)
  );
  
  
  CREATE TABLE IF NOT EXISTS RECIPE (
  RECIPE_ID int(11) NOT NULL AUTO_INCREMENT,
  RECIPE_NAME varchar(255) NOT NULL,
  INGREDIENTS TEXT NOT NULL,
  INSTRUCTIONS TEXT NOT NULL,
  ACTIVE ENUM('y','n') NOT NULL,
  IMAGE varchar(1000),
  PRIMARY KEY (RECIPE_ID)
  );
   