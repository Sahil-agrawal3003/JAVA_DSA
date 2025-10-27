#include <stdio.h>
#include<stdlib.h>

int main () {
  FILE* fptr;
    fptr = fopen("Keywords.txt","r");
    if(fptr = NULL){
        printf("file not found\n");
    }
    else{
        do{

        char c = fgetc(fptr);
        if (feof(fptr))
        break;
        printf ("%c", c);
        } while(1);
        fclose(fptr);
    }
    return 0;
}



        

        
    
    
