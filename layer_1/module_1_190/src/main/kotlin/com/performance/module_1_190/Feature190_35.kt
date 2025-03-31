package com.performance.module_1_190

class Feature190UseCase1(
    private val repository: Feature190Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
