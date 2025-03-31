package com.performance.module_1_131

class Feature131UseCase2(
    private val repository: Feature131Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
