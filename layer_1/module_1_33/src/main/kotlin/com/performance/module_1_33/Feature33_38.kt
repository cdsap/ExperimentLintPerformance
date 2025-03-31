package com.performance.module_1_33

class Feature33UseCase2(
    private val repository: Feature33Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
