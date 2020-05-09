/**
 * Exercise 16:
 * Write a JavaScript program to create a Clock.
 */

function myClock(){
    this.currentDate = new Date();
    this.hours = this.currentDate.getHours();
    this.minutes = this.currentDate.getMinutes();
    this.seconds = this.currentDate.getSeconds();
}

myClock.prototype.run = function(){
    setInterval(this.update.bind(this), 1000);
};

myClock.prototype.update = function(){
    this.updateTime(1);
    console.log(this.hours + ":" + this.minutes + ":" + this.seconds);
};

myClock.prototype.updateTime = function(seconds){
    this.seconds += seconds;
    
    if (this.seconds >= 60) {
        this.minutes++;
        this.seconds = 0;
    }

    if (this.minutes >= 60) {
        this.hours++;
        this.minutes = 0;
    }

    if (this.hours >= 24) {
        this.hours = 0;
    }
};

let clock = new myClock();
clock.run();