package com.performance.module_0_20

class Feature20UseCase0(
    private val repository: Feature20Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
