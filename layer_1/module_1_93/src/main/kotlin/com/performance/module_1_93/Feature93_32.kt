package com.performance.module_1_93

class Feature93UseCase0(
    private val repository: Feature93Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
