package com.performance.module_0_131

class Feature131UseCase2(
    private val repository: Feature131Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
