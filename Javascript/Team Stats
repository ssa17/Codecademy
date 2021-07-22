const team = {
  _players: [{
  firstName: 'Christiano', lastName: 'Ronaldo', age: 35},
  {firstName: 'David', lastName: 'Beckham', age: 46},
  {firstName: 'Michael', lastName: 'Owens', age: 49}],
  _games:[
  {opponent: 'Man City', teamGoals: 2, opponentGoals: 1},
  {opponent: 'Chelsea', teamGoals: 1, opponentGoals: 1},
  {opponent: 'Liverpool', teamGoals: 3, opponentGoals: 0}],
  get players(){
    return this._players;
  },
  get games(){
    return this._games;
  },
  addPlayer(firstName, lastName, age){
    let player = {
      firstName,
      lastName,
      age
    };
    this.players.push(player);
  },
  addGame(opp, myGls, oppGls){
    let game = {
      opponent: opp,
      teamGoals: myGls,
      opponentGoals: oppGls
    };
    this.games.push(game);
  }
}

team.addPlayer('Steph', 'Curry', 28);
team.addPlayer('Lisa', 'Leslie', 44);
team.addPlayer('Bugs', 'Bunny', 76);

console.log(team.players);

team.addGame('Real Madrid', 1, 1);
team.addGame('Luton', 5, 0);
team.addGame('leeds', 2, 0);

console.log(team.games);

