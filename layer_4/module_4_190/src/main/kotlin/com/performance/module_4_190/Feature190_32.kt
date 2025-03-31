package com.performance.module_4_190

class Feature190UseCase0(
    private val repository: Feature190Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
