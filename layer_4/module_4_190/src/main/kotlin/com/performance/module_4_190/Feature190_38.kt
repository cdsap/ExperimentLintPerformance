package com.performance.module_4_190

class Feature190UseCase2(
    private val repository: Feature190Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
