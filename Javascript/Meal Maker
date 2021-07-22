const menu = {
  _courses:{
      appetizers:[],
      mains:[],
      desserts:[]
    },
    get appetizers(){

    },
    set appetizers(appetizerIn){

    },
    get mains(){

    },
    set mains(mainIn){

    },
    get desserts(){

    },
    set desserts(dessertIn){

    },
    get courses(){
      return {
        appetizers: this.appetizers,
        mains: this.mains,
        desserts: this.desserts
      }
    },
    addDishToCourse(courseName, dishName, dishPrice){
      const dish = {
        name: dishName,
        price: dishPrice
      };
      this._courses[courseName].push(dish);
    },
    getRandomDishFromCourse(courseName){
      const dishes = this._courses[courseName];
      const randomIndex = Math.floor(Math.random() * dishes.length);
      return dishes[randomIndex];
    },
    generateRandomMeal: function() {
      const appetizer = this.getRandomDishFromCourse('appetizers');
      const main = this.getRandomDishFromCourse('mains');
      const dessert = this.getRandomDishFromCourse('desserts');
      const totalPrice = appetizer.price + main.price + dessert.price;
      return `Your meals is ${appetizer.name}, ${main.name}, ${dessert.name}. The price is $${totalPrice}.`;
    }
};

menu.addDishToCourse('appetizers', 'Ceasar Salad', 4.25);
menu.addDishToCourse('appetizers', 'Naan Bread', 1.50);
menu.addDishToCourse('appetizers', 'Tandoori Chicken', 3.50);

menu.addDishToCourse('mains', 'Shephards Pie', 7);
menu.addDishToCourse('mains', 'Lasagne', 7);
menu.addDishToCourse('mains', 'Lamb Curry', 8);

menu.addDishToCourse('desserts', 'Ice Cream', 2.50);
menu.addDishToCourse('desserts', 'Coffee', 2.50);
menu.addDishToCourse('desserts', 'Tea', 1.50);

let meal = menu.generateRandomMeal();

console.log(meal);

