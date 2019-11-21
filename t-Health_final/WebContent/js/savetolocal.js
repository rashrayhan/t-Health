/**
 * 
 */
$(function()
		
{
	const addpatientToLocal=function(patient){
        let index=localStorage.length;
        for(let i=0;i<student.length;i++){
        localStorage.setItem(index,patient[i].stid + " | " + patient[i].date +  " | " + patient[i].symptom);
        index++;
        }
        window.onload=(function(e){
        	e.preventDefault();
        	const symptom=$("#symptom").val();
        	const date=$("#date").val();
        	const stid=$("#stid").val();
        	const objpatient={
        	 "studentId":stid,"symptom":symptom,"date":date
        	};
        	
        	addpatientToLocal(objpatient);	
        
        
        
        })

}	

}

)