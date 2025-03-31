package com.performance.module_1_131

class Feature131UseCase0(
    private val repository: Feature131Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
