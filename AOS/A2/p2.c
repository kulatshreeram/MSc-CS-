#include <stdio.h>
#include <fcntl.h>
#include <unistd.h>
int main(){
    int fd;
    fd = open("test.txt", O_RDWR | O_CREAT, 0644);
    if(fd == -1) {
        printf("File open failed\n");
        return 1;}
    printf("File opened successfully\n");
    printf("Process sleeping for 15 seconds...\n");
    sleep(15);                         
    close(fd);                         
    printf("Process terminated\n");
    return 0;
}
