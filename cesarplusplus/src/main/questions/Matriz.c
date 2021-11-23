#include <stdio.h>

int main() { 
    int i,j,p,e,votos;
    scanf("%d", &p);
    scanf("%d", &e);
    int matrix[e][p],princesa[p];

    for(i=0;i<e; ++i) { //linhas
        for(j=0;j<p; ++j) { //colunas
            scanf("%d", &matrix[i][j]);
        }
    }
    
    for(i=0; i<p; i++){ 
        votos = 0;
        for(j=0; j<e; j++){
            votos += matrix[j][i];   
        } 
        princesa[i] = votos;
        if(i == p-1){
            printf("Princesa %d: %d voto(s)", (i + 1), princesa[i]);
        } else {
            printf("Princesa %d: %d voto(s)\n", (i + 1), princesa[i]); 
        }       
    }
 return 0;
}