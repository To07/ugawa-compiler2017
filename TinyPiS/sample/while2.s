	.section .data
	@ 大域変数の定数
_Pi_var_x:
	.word 0
_Pi_var_answer:
	.word 0
	.section .text
	.global _start
_start:
	@ 式をコンパイルした命令列
	ldr r0, =#0
	ldr r1, =_Pi_var_x
	str r0, [r1, #0]
	ldr r0, =#5
	ldr r1, =_Pi_var_answer
	str r0, [r1, #0]
L0:
	ldr r0, =_Pi_var_x
	ldr r0, [r0, #0]
	cmp r0, #0
	beq L1
	ldr r0, =#10
	ldr r1, =_Pi_var_answer
	str r0, [r1, #0]
	b L0
L1:
	@ EXITシステムコール
	ldr r0, =_Pi_var_answer
	ldr r0, [r0, #0]
	mov r7, #1
	swi #0
