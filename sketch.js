
var s;
var siz=15;
var scl=5;
var xf,yf;

function setup()
{
	createCanvas(600,600);
	s=new snake();

}


function draw()
{
	background(51);
	s.update();
	s.show();
	
	xf=random(0,600);
	yf=random(0,600);
	fill(255,204,0);
	rect(xf,yf,5,5);

	s.check();

}

function food()
	{
	xf=random(0,600);
	yf=random(0,600);
	fill(255,204,0);
	rect(xf,yf,5,5);

	}



function keyPressed()
{
	if(keyCode==UP_ARROW)
	{
		s.dir(0,-1);
	}
	if(keyCode==DOWN_ARROW)
	{
		s.dir(0,1);
	}
	if(keyCode==LEFT_ARROW)
	{
		s.dir(-1,0);
	}
	if(keyCode==RIGHT_ARROW)
	{
		s.dir(1,0);
	}
}

function  snake()
{
	this.x=0;
	this.y=0;
	this.xspeed=1;
	this.yspeed=0;
	this.xf=10;
	this.yf=10;
	this.dir=function(x,y)
	{
		this.xspeed=x;
		this.yspeed=y;
	}

	this.update=function()
	{
		this.x=this.xspeed*scl+this.x;
		this.y=this.yspeed*scl+this.y;
	}
	this.show=function()
	{	fill(255);
		rect(this.x,this.y,siz,siz);
	}

	
	this.check=function()
	{
		if(this.x==xf && this.y==yf)
		{
			//food();
			siz=siz+5;
		}
	}

}
