package com.performance.module_0_34

class Feature34UseCase1(
    private val repository: Feature34Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
