package com.performance.module_0_93

class Feature93UseCase2(
    private val repository: Feature93Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
