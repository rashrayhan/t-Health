/**
 * 
 */

$(function()
		
{
	if(localStorage.length>0)
	{
	  let list= $("#listpatients");
	for(let i=0;i<localStorage.length;i++)
	{

	const item=localStorage.getItem(i);
	let newitem="<li class='list-group-item'>" + item + "</li>";

	list.append(newitem);  
	}

	}

	})

