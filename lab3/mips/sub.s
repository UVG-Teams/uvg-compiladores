.data
    x: .word 30
    y: .word 24
    diff: .word 0

.text
.globl main
.ent main
main:

    lw $a0, x
    lw $a1, y

    # li $v0, 0
    sub $v0, $a0, $a1

    sw $v0, diff
    lw $a0, diff

    li $v0, 1
    syscall

    # exit program
    li $v0, 10
    syscall

.end main
