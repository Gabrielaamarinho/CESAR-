#include <stdio.h>
#include <string.h>
#include <math.h>

int main(){
    int princesas, eleitores;

    scanf("%d%d", &princesas,&eleitores);
    
    int votacao[eleitores][princesas];

    for (int i = 0; i < eleitores; i++){
        for (int j = 0; j < princesas; j++){
            scanf("%d", &votacao[j][i]);
        }
        
    }
    
    for (int i = 0; i < princesas; i++) {
		int count = 0;
		for (int j = 0; j < eleitores; j++) {
			if (votacao[j][i] == 1) {
				count++;
			}
		}
		printf("\nPrincesa %d: %d voto(s)", i + 1, count); 
    }
    return 0;
}