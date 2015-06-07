#include <stdio.h>
#include <unistd.h>

int main()
{
    printf("Hello, World!\n");
    int pid = fork();
    if(pid == 0) { //child
        close(1);
        open("./vysledek");
        const char *pole1 = {"./producent", 0};
        const char *pole2 = {"producent", 0};
        execl(pole1, pole2, 0);
    } else {
        wait();
    }
    return 0;
}

