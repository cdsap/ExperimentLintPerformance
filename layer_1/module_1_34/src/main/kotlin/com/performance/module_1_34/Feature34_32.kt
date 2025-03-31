package com.performance.module_1_34

class Feature34UseCase0(
    private val repository: Feature34Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
