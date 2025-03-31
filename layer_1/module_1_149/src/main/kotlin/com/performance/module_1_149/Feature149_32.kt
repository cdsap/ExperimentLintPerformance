package com.performance.module_1_149

class Feature149UseCase0(
    private val repository: Feature149Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
