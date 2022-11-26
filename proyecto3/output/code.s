.data
	_t0: .word 1
	_t1: .word 4
	a: .word 0
	_t3: .asciiz "Hello, World.\n"

	lw $t1, _t0
	lw $t2, _t1
	add $t0, $t1, $t2
	sw $t0, a

.text
.globl main
main:

	la $a0, _t3
	li $v0, 4
	syscall

	lw $a0, a
	li $v0, 1
	syscall
	#goto l_0
