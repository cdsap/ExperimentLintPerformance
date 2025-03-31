package com.performance.module_2_149

class Feature149UseCase2(
    private val repository: Feature149Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
