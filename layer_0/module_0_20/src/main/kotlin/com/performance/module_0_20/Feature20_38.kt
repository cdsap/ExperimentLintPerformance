package com.performance.module_0_20

class Feature20UseCase2(
    private val repository: Feature20Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
