package com.performance.module_1_131

class Feature131UseCase1(
    private val repository: Feature131Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
