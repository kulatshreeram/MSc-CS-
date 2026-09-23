#include <stdio.h>
#include <fcntl.h>
#include <unistd.h>
int main(){
    int fd;
    char a[] = "ABC";
    char b[] = "XYZ";
    fd = open("hole.txt", O_RDWR | O_CREAT | O_TRUNC, 0644);
    if(fd == -1) {
        printf("File open failed\n");
        return 1;}
    write(fd, a, 3);
    lseek(fd, 5, SEEK_CUR);
    write(fd, b, 3);
    close(fd);
    printf("File with hole created successfully\n");
    return 0;
}
