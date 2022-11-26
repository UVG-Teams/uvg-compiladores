.data
	_t0: .word 1
	_t1: .word 4
	_t3: .asciiz "Hello, World.\n"

_t2 <- _t0 + _t1

.text
.globl main
main:

	la $a0, _t3
	li $v0, 4
	syscall

	lw $a0, _t2
	li $v0, 1
	syscall
	#goto l_0
