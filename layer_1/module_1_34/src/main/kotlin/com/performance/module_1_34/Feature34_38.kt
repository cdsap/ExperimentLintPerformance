package com.performance.module_1_34

class Feature34UseCase2(
    private val repository: Feature34Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
