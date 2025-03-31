package com.performance.module_1_148

class Feature148UseCase0(
    private val repository: Feature148Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
