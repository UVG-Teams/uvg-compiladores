.data
    _t0: .word 30
    _t1: .word 24
    diff: .word 0

.text
.globl main
main:
    lw $a0, _t0
    lw $a1, _t1

    # li $v0, 0
    sub $v0, $a0, $a1

    sw $v0, diff
    lw $a0, diff

    li $v0, 1
    syscall

    # exit program
    li $v0, 10
    syscall
